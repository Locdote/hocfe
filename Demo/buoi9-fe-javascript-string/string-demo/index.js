var name = "Nguyen Van A";

var nameSauThay = name.replace("A", "B");

document.write("Ham replace</br>");
document.write("Sau khi thay the A bang B: " + nameSauThay);

document.write("</br>");
document.write("</br>");
document.write("Ham slice</br>");
document.write("Lay ra chu van trong bien name: " + name.slice(7, 10));

document.write("</br>");
document.write("</br>");
document.write("Ham substring</br>");
document.write("Lay ra chu van trong bien name: " + name.substring(7, 10));

document.write("</br>");
document.write("</br>");
document.write("Ham substr</br>");
document.write("Lay ra chu van trong bien name: " + name.substr(7, 10));

document.write("</br>");
document.write("</br>");
document.write("Ham toUpperCase</br>");
document.write("Viet hoa name: " + name.toUpperCase());


document.write("</br>");
document.write("</br>");
document.write("Ham toLowerCase</br>");
document.write("Viet thuong name: " + name.toLowerCase());

var khoangTrong = "    Hello world      ";

console.log(khoangTrong.trim());

document.write("</br>");
document.write("</br>");
document.write("Ham trim</br>");
document.write("Xoa khoang trang o dau va cuoi bien khoangTrong: " + khoangTrong);

var danhSach = "le.van.luyen";
var mangDanhSach = danhSach.split("."); // ["le", "van", "luyen"]
document.write("</br>");
document.write("</br>");
document.write("Ham split</br>");
document.write("mang danh sach sau split " + mangDanhSach);