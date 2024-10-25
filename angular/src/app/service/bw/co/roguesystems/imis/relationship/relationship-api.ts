// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { RelationshipVO } from '@app/model/bw/co/roguesystems/imis/relationship/relationship-vo';
import { HttpClient } from '@angular/common/http';
import { Page } from '@app/model/page.model';
import { SearchObject } from '@app/model/search-object';

@Injectable({
  providedIn: 'root'
})
export class RelationshipApi {
    
    protected path = '/relationship';

    private http = inject(HttpClient);

    public findById(id: number | any ): Observable<RelationshipVO | any> {


        return this.http.get<RelationshipVO | any>(this.path + `/${id}`);

    }

    public getAll(): Observable<RelationshipVO[] | any[]> {


        return this.http.get<RelationshipVO[] | any[]>(this.path);

    }

    public remove(id: number | any ): Observable<boolean | any> {


        return this.http.delete<boolean | any>(this.path + `/${id}`);

    }

    public save(relationship: RelationshipVO | any ): Observable<RelationshipVO | any> {


        return this.http.post<RelationshipVO | any>(this.path, relationship);

    }

    public search(criteria: string | any ): Observable<RelationshipVO[] | any[]> {


        return this.http.post<RelationshipVO[] | any[]>(this.path + `/search?criteria=${criteria}`, criteria);

    }

}
