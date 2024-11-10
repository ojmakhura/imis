// Generated by andromda-angular cartridge (view\components\component.ts.vsl) DO NOT EDIT
import {
  AfterViewInit,
  Component,
  inject,
  effect,
  OnDestroy,
  OnInit,
  ViewChild,
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
import { SearchObject } from '@app/model/search-object';
import { RelationshipDetailsComponent } from './relationship-details.component';
import { TableComponent } from '@app/components/table/table.component';
import { RelationshipApiStore } from '@app/store/bw/co/roguesystems/imis/relationship/relationship-api.store';

@Component({
  selector: "app-relationship-details",
  templateUrl: "./relationship-details.component.html",
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
export class RelationshipDetailsImplComponent extends RelationshipDetailsComponent {

  relationshipStore = inject(RelationshipApiStore);

    constructor() {
        super();

        effect(() => {
    
          let relationship = this.relationshipStore.data();
    
          if(relationship) {
            this.formGroupControl.patchValue(relationship);
    
          }
    
        });
    }

}