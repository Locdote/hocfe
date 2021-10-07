var mang = ["Nguyen Van A", 123, {"ten": "A", "tuoi": 12}];

var mangObject = new Array("Nguyen Van A", 123, {"ten": "A", "tuoi": 12});

// In mang
document.write("In toan bo phan tu trong mang </br>");
document.write(mangObject);

document.write("</br>");
document.write("</br>");
document.write("Tung phan tu </br>");
document.write(mangObject[0]); document.write("</br>");
document.write(mangObject[1]); document.write("</br>");
document.write(mangObject[2].ten); document.write("</br>");

document.write("</br>");
document.write("Thay doi phan tu dau tien thanh nguyen van BBBBB</br>");
mangObject[0] = "Nguyen Van BBBB";
document.write("Sau thay doi: " + mangObject[0]);

document.write("</br>");
document.write("</br>");
document.write("Ham toString()</br>");
document.write("Sau thay doi: " + mangObject.toString());

document.write("</br>");
document.write("</br>");
document.write("Ham join()</br>");
document.write("" + mangObject.join("."));

document.write("</br>");
document.write("</br>");
document.write("Ham push()</br>");
mangObject.push("La Hoc Sinh");
document.write("" + mangObject);

document.write("</br>");
document.write("</br>");
document.write("Ham slice()</br>");
mangObject.splice(0, 1);
document.write("" + mangObject);

var mangHocSinh1 = ["Nguyen Van A", "Nguyen Van B"];
var mangHocSinh2 = ["Nguyen Van C", "Nguyen Van D"];
var mangKetHop = mangHocSinh1.concat(mangHocSinh2);
document.write("</br>");
document.write("</br>");
document.write("Sau khi concat()</br>");
document.write("" + mangKetHop);


var mangHaiChieu = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
document.write("</br>");
document.write("</br>");
document.write("In mang 2 chieu</br>");
document.write("" + mangHaiChieu[1][1]);