
import { inject } from '@angular/core';
import { patchState, signalStore, withMethods, withState } from '@ngrx/signals';
import { rxMethod } from '@ngrx/signals/rxjs-interop';
import { switchMap } from 'rxjs';
import { tapResponse } from '@ngrx/operators';
import { AppState } from '@app/store/app-state';
import { SearchObject } from '@app/model/search-object';
import { Page } from '@app/model/page.model';
import { BeneficiaryVO } from '@app/model/bw/co/roguesystems/imis/policy/beneficiary/beneficiary-vo';
import { BeneficiaryApi } from '@app/service/bw/co/roguesystems/imis/policy/beneficiary/beneficiary-api';

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

export const BeneficiaryApiStore = signalStore(
  { providedIn: 'root' },
  withState(initialState),
  withMethods((store) => {
    const beneficiaryApi = inject(BeneficiaryApi);
    return {
      reset: () => {
        patchState(store, initialState);
      },
      findById: rxMethod<{id: number | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return beneficiaryApi.findById(data.id, ).pipe(
            tapResponse({
              next: (data: BeneficiaryVO | any) => {
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
          return beneficiaryApi.getAll().pipe(
            tapResponse({
              next: (dataList: BeneficiaryVO[] | any[]) => {
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
          return beneficiaryApi.remove(data.id, ).pipe(
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
      save: rxMethod<{benefit: BeneficiaryVO | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return beneficiaryApi.save(data.benefit, ).pipe(
            tapResponse({
              next: (data: BeneficiaryVO | any) => {
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
          return beneficiaryApi.search(data.criteria, ).pipe(
            tapResponse({
              next: (dataList: BeneficiaryVO[] | any[]) => {
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
