public class tt<E>
{
	private E x;
	private E y;
     
    public E getX()
    {
       return x;   
    }

    public E getY(){
       return y;
    }

    public void setX(E x){
      this.x=x;
    }

    public void setY(E y){
      this.y=y;
    }

    public void print(){

     System.out.println("x=:"+x+"y=:"+y);
    }

}