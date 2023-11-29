#include<iostream>
// using namespace std;

namespace Marvellous
{
    void Display()
    {
        std::cout<<"Inside display of Marvellous\n";
    }
}
namespace Infosystem
{
    void Display()
    {
        std::cout<<"Inside Display of Infosystem\n";
    }
} // namespace Infosystem


int main()
{
    Marvellous::Display();
    Infosystem::Display();
    return 0;
}