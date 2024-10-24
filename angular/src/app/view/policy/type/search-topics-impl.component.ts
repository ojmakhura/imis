// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { SearchTopicsComponent } from '@app/view/policy/type/search-topics.component';
import { SearchTopicsVarsForm } from '@app/view/policy/type/search-topics.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { SharedModule } from '@app/@shared';
import { PolicyTypeEditorImplComponent } from '@app/components/policy/type/policy-type-editor-impl.component';

@Component({
  selector: 'app-search-topics',
  templateUrl: './search-topics.component.html',
  styleUrls: ['./search-topics.component.scss'],
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
    PolicyTypeEditorImplComponent,
  ],
})
export class SearchTopicsImplComponent extends SearchTopicsComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: SearchTopicsVarsForm): SearchTopicsVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}