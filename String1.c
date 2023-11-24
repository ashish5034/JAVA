#include<stdio.h>
int CalculateLength(char * str)
{
    int iCnt = 0;
    while (*str != '\0')
    {
        iCnt++;
        str++;
    }
    return iCnt;
}
int main()
{
    char Arr[40];
    printf("Enter Your Name: \n");
    scanf("%[^'\n]s",Arr);  //till pressing enter
    printf("Your name is : %s \n",Arr);
    int iret=0;
    iret = CalculateLength(Arr);
    printf("Length of string is : %d\n",iret);
    
    return 0;
}