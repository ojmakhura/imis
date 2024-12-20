// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { SearchPolicyTypesComponent } from '@app/view/policy/type/search-policy-types.component';
import { SearchPolicyTypesVarsForm } from '@app/view/policy/type/search-policy-types.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { PolicyTypeEditorImplComponent } from '@app/components/policy/type/policy-type-editor-impl.component';

@Component({
  selector: 'app-search-policy-types',
  templateUrl: './search-policy-types.component.html',
  styleUrls: ['./search-policy-types.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,
    CsvModule,
    TableComponent,
    PolicyTypeEditorImplComponent,
  ],
})
export class SearchPolicyTypesImplComponent extends SearchPolicyTypesComponent {

    constructor() {
        super();
        this.policyTypeApiStore.reset()
        this.success = this.policyTypeApiStore.success;
        this.loading = this.policyTypeApiStore.loading;
        this.error = this.policyTypeApiStore.error;
        this.messages = this.policyTypeApiStore.messages;
        this.policyTypesTablePaged = false;
        this.policyTypesTableSignal = this.policyTypeApiStore.dataList;
    }

    override beforeOnInit(form: SearchPolicyTypesVarsForm): SearchPolicyTypesVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }

    override beforeSearchPolicyTypesSearch(form: any): void {
        
      this.policyTypeApiStore.search({
        criteria: this.criteria ? this.criteria : ''
      });
    }
}