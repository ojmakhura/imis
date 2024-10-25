// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { CustomerVO } from '@app/model/bw/co/roguesystems/imis/customer/customer-vo';
import { HttpClient } from '@angular/common/http';
import { Page } from '@app/model/page.model';
import { SearchObject } from '@app/model/search-object';

@Injectable({
  providedIn: 'root'
})
export class CustomerApi {
    
    protected path = '/customer';

    private http = inject(HttpClient);

    public findById(id: number | any ): Observable<CustomerVO | any> {


        return this.http.get<CustomerVO | any>(this.path + `/${id}`);

    }

    public getAll(): Observable<CustomerVO[] | any[]> {


        return this.http.get<CustomerVO[] | any[]>(this.path);

    }

    public getAllPaged(pageNumber: number | any , pageSize: number | any ): Observable<Page<CustomerVO> | any> {


        return this.http.get<Page<CustomerVO> | any>(this.path + `/page/${pageNumber}/size/${pageSize}`);

    }

    public pagedSearch(criteria: SearchObject<string> | any ): Observable<Page<CustomerVO> | any> {


        return this.http.post<Page<CustomerVO> | any>(this.path + `/search/page`, criteria);

    }

    public remove(id: number | any ): Observable<boolean | any> {


        return this.http.delete<boolean | any>(this.path + `/${id}`);

    }

    public save(customer: CustomerVO | any ): Observable<CustomerVO | any> {


        return this.http.post<CustomerVO | any>(this.path, customer);

    }

    public search(criteria: string | any ): Observable<CustomerVO[] | any[]> {


        return this.http.get<CustomerVO[] | any[]>(this.path + `/search?criteria=${criteria}`);

    }

}
