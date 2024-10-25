// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { LearningOutcomeViewComponent } from '@app/view/policy/beneficiary/learning-outcome-view.component';
import { LearningOutcomeViewVarsForm } from '@app/view/policy/beneficiary/learning-outcome-view.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { SharedModule } from '@app/@shared';
import { BeneficiaryEditorImplComponent } from '@app/components/policy/beneficiary/beneficiary-editor-impl.component';
import { BeneficiaryDetailsImplComponent } from '@app/components/policy/beneficiary/beneficiary-details-impl.component';

@Component({
  selector: 'app-learning-outcome-view',
  templateUrl: './learning-outcome-view.component.html',
  styleUrls: ['./learning-outcome-view.component.scss'],
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
    BeneficiaryEditorImplComponent,
    BeneficiaryDetailsImplComponent,
  ],
})
export class LearningOutcomeViewImplComponent extends LearningOutcomeViewComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: LearningOutcomeViewVarsForm): LearningOutcomeViewVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}