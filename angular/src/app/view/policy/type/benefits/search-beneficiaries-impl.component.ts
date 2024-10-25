// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { SearchBeneficiariesComponent } from '@app/view/policy/type/benefits/search-beneficiaries.component';
import { SearchBeneficiariesVarsForm } from '@app/view/policy/type/benefits/search-beneficiaries.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { SharedModule } from '@app/@shared';
import { BenefitEditorImplComponent } from '@app/components/policy/type/benefits/benefit-editor-impl.component';

@Component({
  selector: 'app-search-beneficiaries',
  templateUrl: './search-beneficiaries.component.html',
  styleUrls: ['./search-beneficiaries.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    SharedModule,
    MaterialModule,
    CsvModule,
    TableComponent,
    BenefitEditorImplComponent,
  ],
})
export class SearchBeneficiariesImplComponent extends SearchBeneficiariesComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: SearchBeneficiariesVarsForm): SearchBeneficiariesVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}