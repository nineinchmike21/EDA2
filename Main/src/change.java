/*
public class change {
    public static int min(int m,int n){
        int v;
        if(m < n){
            v=m;
        }else{
            v=n;
        }
        return v;
    }

    public static void Coins(int coins){
        int[] amount = new int[coins];
    }
    public static void setValues(int[] T){
        T = new int[]{1, 5, 8,11};
    }

    public static int change(int amount){
        int N = 4;
        int[] Q= new int[amount];
        int[] T = new int[N];
        int[][] m= {};
        Coins(amount);
        setValues(T);
        for(int q=1; q< Q.length; q++){
            int v = Integer.MAX_VALUE;
            for(int i = 1; i< T.length;i++){
                if(T[i] < q){
                    v= min(v,1+Q[q-T[i]]);
                }
            }Q[q] = v;
        }

        for(int i1= 0;i1< m.length; i1++){
            for(int i2= 0; i2< m[i1].length;i2++){
                System.out.println(m[i1][i2]+ "");
            }
        }
        return Q[4];
    }

    public static void main(String[] args){
        System.out.println(change(5));
    }
}
*/