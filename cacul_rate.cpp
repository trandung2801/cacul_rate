#include <iostream>

using namespace std;


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
    
    if(type_number == 1){
        if(0 <= price && price < 900000000) {
            cout << "3%" << endl;
        } else if(price == 900000000) {
            cout << "3.5%" << endl;
        } else if(900000000 <= price && price < 2000000000) {
            cout << "4.5%" << endl;
        } else {
            cout << "Số tiền bạn muốn vay không hợp lệ" << endl;
        }
    } else if (type_number == 2) {
        if(0 <= price && price < 900000000) {
            cout << "4%" << endl;
        } else if(price == 900000000) {
            cout << "5%" << endl;
        } else if(900000000 <= price && price < 2000000000) {
            cout << "7%" << endl;
        } else {
            cout << "Số tiền bạn muốn vay không hợp lệ" << endl;
        }
    } else {
        cout << "Bạn đã nhập sai mục đích" << endl;
    }
}
