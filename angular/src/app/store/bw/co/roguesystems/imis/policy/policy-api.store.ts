
import { inject } from '@angular/core';
import { patchState, signalStore, withMethods, withState } from '@ngrx/signals';
import { rxMethod } from '@ngrx/signals/rxjs-interop';
import { switchMap } from 'rxjs';
import { tapResponse } from '@ngrx/operators';
import { AppState } from '@app/store/app-state';
import { SearchObject } from '@app/model/search-object';
import { Page } from '@app/model/page.model';
import { PolicyVO } from '@app/model/bw/co/roguesystems/imis/policy/policy-vo';
import { PolicyApi } from '@app/service/bw/co/roguesystems/imis/policy/policy-api';

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

export const PolicyApiStore = signalStore(
  { providedIn: 'root' },
  withState(initialState),
  withMethods((store) => {
    const policyApi = inject(PolicyApi);
    return {
      reset: () => {
        patchState(store, initialState);
      },
      findById: rxMethod<{id: number | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return policyApi.findById(data.id, ).pipe(
            tapResponse({
              next: (data: PolicyVO | any) => {
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
      getAll: rxMethod<void>(
        switchMap(() => {
          patchState(store, { loading: true });
          return policyApi.getAll().pipe(
            tapResponse({
              next: (dataList: PolicyVO[] | any[]) => {
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
          return policyApi.remove(data.id, ).pipe(
            tapResponse({
              next: (data: boolean | any) => {
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
      save: rxMethod<{policy: PolicyVO | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return policyApi.save(data.policy, ).pipe(
            tapResponse({
              next: (data: PolicyVO | any) => {
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
          return policyApi.search(data.criteria, ).pipe(
            tapResponse({
              next: (dataList: PolicyVO[] | any[]) => {
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
