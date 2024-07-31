import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  //name : string;
  //age : number;
  //email : string;
  //imagepath : string;
  //fname : string;

  //constructor(){
    //this.name="priya";
    //this.age=20;
    //this.email="priyanarayanan2603@gmail.com";
    //this.imagepath ="./assets/logo1.png";
    //this.fname="";
  //}
  //change(){
    //this.name ="priyanarayanan";
  //}
  flag : boolean;
  vehicles : string[];
  selectedvehicle : string;
  myStyle :{};
  myClass : string;

  constructor(){
    this.flag=true;
    this.vehicles =["twowheeler","threewheeler","fourwheeler"];
    this.selectedvehicle = "";
    this.myStyle = {'width' : '40%', 'border': '2px solid blue','border-radius' : '25px'} ;
  
  this.myClass="myClass1";
  }
  
  changeFlag(){
    this.flag=! this.flag;
  }

  setSelectedItem(vec :string){
    this.selectedvehicle =vec;

  }
  changeStyle(){
    this.myStyle = {'width' : '40%', 'border': '2px solid pink','border-radius' : '25px'} ;
  }

  }

