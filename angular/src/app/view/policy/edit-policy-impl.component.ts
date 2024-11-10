// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { EditPolicyComponent } from '@app/view/policy/edit-policy.component';
import { EditPolicyVarsForm } from '@app/view/policy/edit-policy.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { PolicyDetailsImplComponent } from '@app/components/policy/policy-details-impl.component';
import { PolicyEditorImplComponent } from '@app/components/policy/policy-editor-impl.component';

@Component({
  selector: 'app-edit-policy',
  templateUrl: './edit-policy.component.html',
  styleUrls: ['./edit-policy.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,
    CsvModule,
    TableComponent,
    PolicyDetailsImplComponent,
    PolicyEditorImplComponent,
  ],
})
export class EditPolicyImplComponent extends EditPolicyComponent {

    constructor() {
        super();
        this.policyApiStore.reset()
        this.success = this.policyApiStore.success;
        this.loading = this.policyApiStore.loading;
        this.error = this.policyApiStore.error;
    }

    override beforeOnInit(form: EditPolicyVarsForm): EditPolicyVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }

    override beforeEditPolicySave(form: any): void {
        form.policy = { ...this.policyEditor?.policyEditorForm?.value };
        this.policyApiStore.save(form);
    }
}