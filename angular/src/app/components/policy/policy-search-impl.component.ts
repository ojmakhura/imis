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
import { PolicyTypeVO } from '@app/model/bw/co/roguesystems/imis/policy/type/policy-type-vo';
import { CustomerVO } from '@app/model/bw/co/roguesystems/imis/customer/customer-vo';
import { BenefitVO } from '@app/model/bw/co/roguesystems/imis/policy/type/benefits/benefit-vo';
import { IdType } from '@app/model/bw/co/roguesystems/imis/customer/id-type';
import { KycVO } from '@app/model/bw/co/roguesystems/imis/kyc/kyc-vo';
import { PolicyStatus } from '@app/model/bw/co/roguesystems/imis/policy/policy-status';
import { SearchObject } from '@app/model/search-object';
import { PolicySearchComponent } from './policy-search.component';
import { TableComponent } from '@app/components/table/table.component';

@Component({
  selector: "app-policy-search",
  templateUrl: "./policy-search.component.html",
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
export class PolicySearchImplComponent extends PolicySearchComponent {

    constructor() {
        super();
    }

}