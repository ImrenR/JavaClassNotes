package j102_OCA.Q076;
abstract class Planet implements Galaksy {

    protected void revolve(){
    }
    abstract void rotate();//public ve protected olabilir

}
class Earth extends Planet{
    protected void revolve(){ //protected
  }
    void rotate(){ //make a protected
  }

    @Override
    public void galaksy() {

    }
}

//Which two modifications enable the code to compile? or question might be three modifications
//A. Make the method at line 8 protected.
//B.	Make the method at line 8 public.
//C.	Make the method at line 10 protected.
//D.	Make the method at line 4 public.
//E.	Make the method at line 2 public.




//Answer: AC veya BC ikiside calisir
// */
