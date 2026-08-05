let DATA="This is a data which is private and cannot be accessed by any other class or function"
class user{
    constructor(name,email){
        this.name=name;
        this.email=email;
    }
    viewData(){
        console.log("data = ",DATA);
    }
}
class Admin extends user{
    constructor(name,email){
        super(name,email);
    }
  editData(){
    DATA="some new value";
  }  
}
let student1=new user("sarthak","sarthakmishra200906@gmail.com");
let student2=new user("satyam","satyammishra200906@gmail.com");
let admin1=new Admin("admin","admin@gmail.com");
