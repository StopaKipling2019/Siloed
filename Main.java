public class Main {

    public static void main(String[] args) {
	// write your code here
        float h1=72f;
        float h2=19f;
        float h3=50f;
        float h4=67f;
        float h5=16f;
        float h6=53f;
        float h7=69f;
        float h8=30f;
        float h9=52f;
        float h10=40f;
        float h11=31f;
        float h12=75f;
        float d1=22f;
        float d2=18f;
        float d3=13f;
        float d4=16f;
        float d5=14f;
        float d6=23f;
        float d7=22f;
        float d8=22f;
        float d9=23f;
        float d10=16f;
        float d11=18f;
        float d12=23f;
        float pi=3.14f;
        float v1=((d1/2f)*(d1/2f)*pi)*h1;
        float v2=((d2/2f)*(d2/2f)*pi)*h2;
        float v3=((d3/2f)*(d3/2f)*pi)*h3;
        float v4=((d4/2f)*(d4/2f)*pi)*h4;
        float v5=((d5/2f)*(d5/2f)*pi)*h5;
        float v6=((d6/2f)*(d6/2f)*pi)*h6;
        float v7=((d7/2f)*(d7/2f)*pi)*h7;
        float v8=((d8/2f)*(d8/2f)*pi)*h8;
        float v9=((d9/2f)*(d9/2f)*pi)*h9;
        float v10=((d10/2f)*(d10/2f)*pi)*h10;
        float v11=((d11/2f)*(d11/2f)*pi)*h11;
        float v12=((d12/2f)*(d12/2f)*pi)*h12;
        float vTot=v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12;
        int popTot=37640;
        int dayTot=28;
        float usageNeeded=vTot/(popTot*dayTot);
        float usageCurrent=0.246f;
        float usageDifference=usageCurrent-usageNeeded;
        System.out.println(usageDifference);
        System.out.println("Each person must save " + usageDifference + " cubic meters of water every day");
