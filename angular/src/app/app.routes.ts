// license-header angular merge-point
//
/**
 * @author Generated by app-routing.module.ts.vsl in andromda-anglar-cartridge Do not modify by hand!
 *
 * MODEL CLASS:  $validationName
 */
import { Routes } from '@angular/router';
import { Shell } from '@app/shell/shell.service';
import { LoginComponent } from './auth/login.component';

export const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent,
  },
  Shell.childRoutes([
    {
      path: '',
      data: { title: 'Home' },
      loadChildren: () => import('./home/home.routes').then((m) => m.routes),
    },
    {
      path: 'about',
      data: { title: 'About' },
      loadChildren: () => import('./about/about.routes').then((m) => m.routes),
    },
    {
      path: 'customer', 
      loadChildren: () => import('@app/view/customer/customer.routes').then((m) => m.routes),
    },
    {
      path: 'policy', 
      loadChildren: () => import('@app/view/policy/policy.routes').then((m) => m.routes),
    },
    {
      path: 'policy/beneficiary', 
      loadChildren: () => import('@app/view/policy/beneficiary/beneficiary.routes').then((m) => m.routes),
    },
    {
      path: 'policy/type', 
      loadChildren: () => import('@app/view/policy/type/policy-type.routes').then((m) => m.routes),
    },
    {
      path: 'policy/type/benefit', 
      loadChildren: () => import('@app/view/policy/type/benefits/policy-type-benefit.routes').then((m) => m.routes),
    },
    {
      path: 'relationship', 
      loadChildren: () => import('@app/view/relationship/relationship.routes').then((m) => m.routes),
    },
  ]),
  // Fallback when no prior route is matched
  { 
    path: '**', redirectTo: '', pathMatch: 'full' 
  },
];
