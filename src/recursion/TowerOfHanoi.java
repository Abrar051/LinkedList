package recursion;

public class TowerOfHanoi {
    public int diskNumber;
    public int towerNumber;
    public static int recursion(int n) {
        if (n == 1) {
            System.out.println("stopped");
            return 1;
        }
        System.out.println("Recursion process : "+n);
        System.out.println("Returned result : "+recursion(n-1));
        return  n*recursion(n - 1);
    }
    public void Hanoi(int diskNumber, int source,int  dest , int aux)
    {
        if (diskNumber==1)
        {
            System.out.println("Moving disk from "+source+" to destination "+dest);
            return;
        }
        else
        {
            Hanoi(diskNumber-1,source,aux,dest);
            System.out.println("Move "+diskNumber +" from "+source+" to destination "+dest);
            Hanoi(diskNumber-1,aux,dest,source);
            System.out.println("Move "+diskNumber +" from "+source+" to destination "+dest);
        }
    }
}
