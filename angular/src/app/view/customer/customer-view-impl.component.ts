// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { CustomerViewComponent } from '@app/view/customer/customer-view.component';
import { CustomerViewVarsForm } from '@app/view/customer/customer-view.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { SharedModule } from '@app/@shared';
import { CustomerEditorImplComponent } from '@app/components/customer/customer-editor-impl.component';
import { CustomerDetailsImplComponent } from '@app/components/customer/customer-details-impl.component';

@Component({
  selector: 'app-customer-view',
  templateUrl: './customer-view.component.html',
  styleUrls: ['./customer-view.component.scss'],
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
    CustomerEditorImplComponent,
    CustomerDetailsImplComponent,
  ],
})
export class CustomerViewImplComponent extends CustomerViewComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: CustomerViewVarsForm): CustomerViewVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}