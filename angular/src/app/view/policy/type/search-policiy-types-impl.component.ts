// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { SearchPoliciyTypesComponent } from '@app/view/policy/type/search-policiy-types.component';
import { SearchPoliciyTypesVarsForm } from '@app/view/policy/type/search-policiy-types.component';
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
  selector: 'app-search-policiy-types',
  templateUrl: './search-policiy-types.component.html',
  styleUrls: ['./search-policiy-types.component.scss'],
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
export class SearchPoliciyTypesImplComponent extends SearchPoliciyTypesComponent {

    constructor() {
        super();
        this.policyTypeApiStore.reset()
        this.success = this.policyTypeApiStore.success;
        this.loading = this.policyTypeApiStore.loading;
        this.error = this.policyTypeApiStore.error;
    }

    override beforeOnInit(form: SearchPoliciyTypesVarsForm): SearchPoliciyTypesVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}