// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { SearchBenefitComponent } from '@app/view/policy/type/benefits/search-benefit.component';
import { SearchBenefitVarsForm } from '@app/view/policy/type/benefits/search-benefit.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { BenefitEditorImplComponent } from '@app/components/policy/type/benefits/benefit-editor-impl.component';

@Component({
  selector: 'app-search-benefit',
  templateUrl: './search-benefit.component.html',
  styleUrls: ['./search-benefit.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,
    CsvModule,
    TableComponent,
    BenefitEditorImplComponent,
  ],
})
export class SearchBenefitImplComponent extends SearchBenefitComponent {

    constructor() {
        super();
        this.benefitApiStore.reset()
        this.success = this.benefitApiStore.success;
        this.loading = this.benefitApiStore.loading;
        this.error = this.benefitApiStore.error;
    }

    override beforeOnInit(form: SearchBenefitVarsForm): SearchBenefitVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}