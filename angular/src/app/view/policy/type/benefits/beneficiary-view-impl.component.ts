// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { BeneficiaryViewComponent } from '@app/view/policy/type/benefits/beneficiary-view.component';
import { BeneficiaryViewVarsForm } from '@app/view/policy/type/benefits/beneficiary-view.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { SharedModule } from '@app/@shared';
import { BenefitDetailsImplComponent } from '@app/components/policy/type/benefits/benefit-details-impl.component';
import { BenefitEditorImplComponent } from '@app/components/policy/type/benefits/benefit-editor-impl.component';

@Component({
  selector: 'app-beneficiary-view',
  templateUrl: './beneficiary-view.component.html',
  styleUrls: ['./beneficiary-view.component.scss'],
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
    BenefitDetailsImplComponent,
    BenefitEditorImplComponent,
  ],
})
export class BeneficiaryViewImplComponent extends BeneficiaryViewComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: BeneficiaryViewVarsForm): BeneficiaryViewVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}