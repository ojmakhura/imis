// Generated by andromda-angular cartridge (view\components\component.ts.vsl) DO NOT EDIT
import {
  AfterViewInit,
  Component,
  inject,
  Input,
  OnDestroy,
  OnInit,
  ViewChild,
  effect
} from "@angular/core";
import {COMMA, ENTER} from '@angular/cdk/keycodes';
import {
  FormsModule,
  ReactiveFormsModule,
  FormGroup,
  FormControl,
  FormBuilder,
  Validators,
  FormArray,
} from "@angular/forms";
import { SelectItem } from "@app/utils/select-item";
import { MatSelectChange } from '@angular/material/select';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { MatChip, MatChipInput, MatChipInputEvent } from "@angular/material/chips";
import {MatAutocompleteSelectedEvent, MatAutocompleteModule} from '@angular/material/autocomplete';
import { MatDialog } from '@angular/material/dialog';
import { firstValueFrom, Observable, map, of, startWith } from "rxjs";
import { CommonModule } from '@angular/common';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { Gender } from '@app/model/bw/co/roguesystems/imis/customer/gender';
import { PolicyVO } from '@app/model/bw/co/roguesystems/imis/policy/policy-vo';
import { RelationshipVO } from '@app/model/bw/co/roguesystems/imis/relationship/relationship-vo';
import { PolicyTypeVO } from '@app/model/bw/co/roguesystems/imis/policy/type/policy-type-vo';
import { CustomerVO } from '@app/model/bw/co/roguesystems/imis/customer/customer-vo';
import { BenefitVO } from '@app/model/bw/co/roguesystems/imis/policy/type/benefits/benefit-vo';
import { IdType } from '@app/model/bw/co/roguesystems/imis/customer/id-type';
import { KycVO } from '@app/model/bw/co/roguesystems/imis/kyc/kyc-vo';
import { BeneficiaryVO } from '@app/model/bw/co/roguesystems/imis/policy/beneficiary/beneficiary-vo';
import { PolicyStatus } from '@app/model/bw/co/roguesystems/imis/policy/policy-status';
import { BeneficiaryType } from '@app/model/bw/co/roguesystems/imis/policy/beneficiary/beneficiary-type';
import { SearchObject } from '@app/model/search-object';
import { PolicyDetailsComponent } from './policy-details.component';
import { TableComponent } from '@app/components/table/table.component';
import { PolicyApiStore } from '@app/store/bw/co/roguesystems/imis/policy/policy-api.store';

@Component({
  selector: "app-policy-details",
  templateUrl: "./policy-details.component.html",
  styleUrls: [],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,
    CsvModule,
    TableComponent,
  ]
})
export class PolicyDetailsImplComponent extends PolicyDetailsComponent {

  policyStore = inject(PolicyApiStore)
  
    constructor() {
        super();

        effect(() => {
          let policy = this.policyStore.data();
    
          if(policy) {
            this.formGroupControl.patchValue(policy);
          }
        });
    }

}