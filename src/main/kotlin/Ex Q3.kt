open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname:
    String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age:
Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age:
    Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
fun main(){
    var s1=Student("stavan","joshi",19,21012022020,"CE","C","AB8")
    var s2=Student("anmol","joshi",20,20012014,"CE","C","AB7")
    var s3=Student("chetan","joshi",21,200111134,"IT","B","AB3")
    var s4=Student("yuvi","joshi",19,2001112,"Arts","A","AB9")
    var s5=Student("jaibhole","mahadev",18,2001179,"B.Pharm","A","AB1")
}
