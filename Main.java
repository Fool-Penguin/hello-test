class hIghLow
{public static void main(String[] args)
{
int[] numBers = {9, 3, 5, 7, 1};
sortArr(numBers);}
public static void sortArr(int[] xx)
{for (int i = 0; i < xx.length; i++) {
for (int j = 0; j < xx.length; j++) {
if (xx[i] > xx[j]) {
int temp = xx[i];
xx[i] = xx[j];
xx[j] = temp;}
}}System.out.println(xx[0]);}}
