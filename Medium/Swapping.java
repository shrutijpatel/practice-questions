public static void swapNumberswithtemp(int a, int b) { 
int temp = a;
a = b;
b = temp;
}
public static void swapNumberswithouttemp(int a, int b) {
b = b + a;
a = b - a;
b = b - a;
}
public static void main(String[] args) {
int a = 10;
int b = 20;
swapNumbers(a, b);
System.out.printf("%d %d", a, b); 
}
