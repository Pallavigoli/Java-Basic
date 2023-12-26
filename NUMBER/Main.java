package NUMBER;
class Number
{
int value;
public Number(int value) {

this.value = value;

}
int calculateFactors()
{
    int count=0;
    for (int i = 1; i < value; i++) {
        if(value%i==0)
        {
            count++;
        }
    }
    return count;
}
}

class Factor extends Number
{
    public Factor(int value) {
        super(value);
    }
    
}

