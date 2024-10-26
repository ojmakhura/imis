
import { inject } from '@angular/core';
import { patchState, signalStore, withMethods, withState } from '@ngrx/signals';
import { rxMethod } from '@ngrx/signals/rxjs-interop';
import { switchMap } from 'rxjs';
import { tapResponse } from '@ngrx/operators';
import { AppState } from '@app/store/app-state';
import { SearchObject } from '@app/model/search-object';
import { Page } from '@app/model/page.model';
import { RelationshipVO } from '@app/model/bw/co/roguesystems/imis/relationship/relationship-vo';
import { RelationshipApi } from '@app/service/bw/co/roguesystems/imis/relationship/relationship-api';

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

export const RelationshipApiStore = signalStore(
  { providedIn: 'root' },
  withState(initialState),
  withMethods((store) => {
    const relationshipApi = inject(RelationshipApi);
    return {
      reset: () => {
        patchState(store, initialState);
      },
      findById: rxMethod<{id: number | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return relationshipApi.findById(data.id, ).pipe(
            tapResponse({
              next: (data: RelationshipVO | any) => {
                patchState(
                  store, 
                  { 
                     data, 
                     loading: false, 
                     error: false,
                     success: true, 
                     messages: ["Found relationshionship " + data.relation] 
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
          return relationshipApi.getAll().pipe(
            tapResponse({
              next: (dataList: RelationshipVO[] | any[]) => {
                patchState(
                  store, 
                  { 
                    dataList, 
                     loading: false, 
                     success: true, 
                     error: false,
                     messages: [`Found ${dataList.length} relationships`] 
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
          return relationshipApi.remove(data.id, ).pipe(
            tapResponse({
              next: (removed: boolean | any) => {
                patchState(
                  store, 
                  { 
                     data: null, 
                     loading: false, 
                     success: true, 
                     messages: [removed ? "Relationship removed" : "Relationship not removed"] 
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    error: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      save: rxMethod<{relationship: RelationshipVO | any }>(
        switchMap((data) => {
          patchState(store, { loading: true });
          return relationshipApi.save(data.relationship, ).pipe(
            tapResponse({
              next: (data: RelationshipVO | any) => {
                patchState(
                  store, 
                  { 
                     data, 
                     loading: false, 
                     success: true, 
                     error: false,
                     messages: [`Saved relationship ${data.relation}`] 
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
          return relationshipApi.search(data.criteria, ).pipe(
            tapResponse({
              next: (dataList: RelationshipVO[] | any[]) => {
                patchState(
                  store, 
                  { 
                    dataList, 
                     loading: false, 
                     success: true, 
                     error: false,
                     messages: [`Found ${dataList.length} relationships`] 
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
