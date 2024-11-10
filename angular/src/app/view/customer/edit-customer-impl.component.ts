// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { EditCustomerComponent } from '@app/view/customer/edit-customer.component';
import { EditCustomerVarsForm } from '@app/view/customer/edit-customer.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { CustomerEditorImplComponent } from '@app/components/customer/customer-editor-impl.component';
import { CustomerDetailsImplComponent } from '@app/components/customer/customer-details-impl.component';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,
    CsvModule,
    TableComponent,
    CustomerEditorImplComponent,
    CustomerDetailsImplComponent,
  ],
})
export class EditCustomerImplComponent extends EditCustomerComponent {

    constructor() {
        super();
        this.customerApiStore.reset()
        this.success = this.customerApiStore.success;
        this.loading = this.customerApiStore.loading;
        this.error = this.customerApiStore.error;
        this.messages = this.customerApiStore.messages;

        this.route.queryParams.subscribe((params: any) => {
          if (params.id) {
            this.customerApiStore.findById(params);
          }
        });
    }

    override beforeOnInit(form: EditCustomerVarsForm): EditCustomerVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
    
    override beforeEditCustomerSave(form: any): void {
      form.customer = { ...this.customerEditor?.formGroupControl?.value };
      this.customerApiStore.save(form);
    }

    override get editCustomerViewDetailsId(): number {
      return this.customerEditor?.formGroupControl?.get('id')?.value;
    }
}