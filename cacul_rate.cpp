#include <iostream>

using namespace std;

void cacul_rate(int type_number,int price) {
    if(type_number == 1){
        if(0 <= price && price < 900000000) {
            cout << "Lãi suất là: " << "3%" << endl;
        } else if(price == 900000000) {
            cout << "Lãi suất là: " << "3.5%" << endl;
        } else if(900000000 <= price && price < 2000000000) {
            cout << "Lãi suất là: " << "4.5%" << endl;
        } else {
            cout << "Số tiền bạn muốn vay không hợp lệ" << endl;
        }
    } else if (type_number == 2) {
        if(0 <= price && price < 900000000) {
            cout << "Lãi suất là: " << "4%" << endl;
        } else if(price == 900000000) {
            cout << "Lãi suất là: " << "5%" << endl;
        } else if(900000000 <= price && price < 2000000000) {
            cout << "Lãi suất là: " << "7%" << endl;
        } else {
            cout << "Lãi suất là: " << "Số tiền bạn muốn vay không hợp lệ" << endl;
        }
    } else {
        cout << "Bạn đã nhập sai mục đích" << endl;
    }
}

void test_case() {
    //R1
    cacul_rate(1, -1);

    //R2
    cacul_rate(1, 1);

    //R3
    cacul_rate(1, 900000000);

    //R4
    cacul_rate(1, 1000000000);

    //R5
    cacul_rate(1, 2100000000);

    //R6
    cacul_rate(2, -1);

    //R7
    cacul_rate(2, 1);

    //R8
    cacul_rate(2, 900000000);

    //R9
    cacul_rate(2, 1000000000);

    //R10
    cacul_rate(2, 2100000000);
}

int main() {
    int type_number;
    int price;
    
    cout << "Mục đích vay tiền của bạn là gì ?" << endl;
    cout << "Ấn số 1: Nếu bạn vay tiền mua xe" << endl;
    cout << "Ấn số 2: Nếu bạn vay tiền mua nhà" << endl;
    cin >> type_number;
    
    cout << "Số tiền bạn muốn vay phải lớn hơn 0 và nhỏ hơn 2 tỉ vnd " << endl;
    cout << "Số tiền bạn muốn vay là: " << endl;
    cin >> price;
    cacul_rate(type_number, price);
}
