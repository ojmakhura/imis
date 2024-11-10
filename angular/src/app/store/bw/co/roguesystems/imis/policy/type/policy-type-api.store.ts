
import { inject } from '@angular/core';
import { patchState, signalStore, withMethods, withState } from '@ngrx/signals';
import { rxMethod } from '@ngrx/signals/rxjs-interop';
import { switchMap } from 'rxjs';
import { tapResponse } from '@ngrx/operators';
import { AppState } from '@app/store/app-state';
import { SearchObject } from '@app/model/search-object';
import { Page } from '@app/model/page.model';
import { PolicyTypeVO } from '@app/model/bw/co/roguesystems/imis/policy/type/policy-type-vo';
import { PolicyTypeApi } from '@app/service/bw/co/roguesystems/imis/policy/type/policy-type-api';

const initialState: AppState<any, any> = {
  data: null,
  dataList: [],
  dataPage: new Page<any>(),
  searchCriteria: new SearchObject<any>(),
  error: null,
  loading: false,
  success: false,
  messages: []
};

export const PolicyTypeApiStore = signalStore(
  { providedIn: 'root' },
  withState(initialState),
  withMethods((store) => {
    const policyTypeApi = inject(PolicyTypeApi);
    return {
      reset: () => {
        patchState(store, initialState);
      },
      findById: rxMethod<{id: number | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return policyTypeApi.findById(data.id, ).pipe(
            tapResponse({
              next: (data: PolicyTypeVO | any) => {
                patchState(
                  store, 
                  { 
                     data, 
                     loading: false, 
                     success: true, 
                     messages: [`Found policy type ${data.type}`] 
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      getAll: rxMethod<void>(
        switchMap(() => {
          patchState(store, { loading: true });
          return policyTypeApi.getAll().pipe(
            tapResponse({
              next: (dataList: PolicyTypeVO[] | any[]) => {
                patchState(
                  store, 
                  { 
                    dataList, 
                     loading: false, 
                     success: true, 
                     messages: [] 
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      remove: rxMethod<{id: number | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return policyTypeApi.remove(data.id, ).pipe(
            tapResponse({
              next: (removed: boolean | any) => {
                patchState(
                  store, 
                  { 
                     loading: false, 
                     success: true, 
                     messages: [] 
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      save: rxMethod<{type: PolicyTypeVO | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return policyTypeApi.save(data.type, ).pipe(
            tapResponse({
              next: (data: PolicyTypeVO | any) => {
                patchState(
                  store, 
                  { 
                     data, 
                     loading: false, 
                     success: true, 
                     messages: [] 
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      search: rxMethod<{criteria: string | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return policyTypeApi.search(data.criteria, ).pipe(
            tapResponse({
              next: (dataList: PolicyTypeVO[] | any[]) => {
                patchState(
                  store, 
                  { 
                    dataList, 
                     loading: false, 
                     success: true, 
                     messages: [] 
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
    }
  }),
);
