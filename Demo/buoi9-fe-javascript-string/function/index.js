function inRaHello() {
    document.write("Demo function:</br>")
    document.write("Hello");
}

inRaHello();

document.write("</br></br>");

function tinhTong(soThuNhat, soThuHai) {
    var tong = soThuNhat + soThuHai;
    document.write("Ham tinh tong 2 so " + soThuNhat + " + " + soThuHai + ": " + tong);
}

tinhTong(10, 2);

function tinhTongTraKetQua(soThuNhat, soThuHai) {
    var tong = soThuNhat + soThuHai;
    return tong;
}

document.write("</br></br>");
var giaTriTong = tinhTongTraKetQua(20, 11);
document.write("Ham tinh tong 2 so, tra ve ket qua: " + giaTriTong);