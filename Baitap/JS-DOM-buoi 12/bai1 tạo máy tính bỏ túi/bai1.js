var noiDung = "";
var phepTinhHienTai = "";
var dayPhepTinh = ["+", "-", "*", "/"];
var daCoPhepTinh = false;

function ghiSo(theSo) {
    noiDung += theSo.value;
    inRaNoiDung();
}

function ghiPhepTinh(thePhepTinh) {
    phepTinhHienTai = thePhepTinh.value;

    phepTinh = noiDung.substr(noiDung.length - 1);
    var laPhepTinh = kiemTraPhepTinh(phepTinh);

    if (!daCoPhepTinh)
        if (laPhepTinh) {
            noiDung = noiDung.substring(0, noiDung.length - 1);
            noiDung += phepTinhHienTai;
        } else {
            noiDung += phepTinhHienTai;
        }
    daCoPhepTinh = true;

    inRaNoiDung();
}

function xoaHet() {
    noiDung = "";
    daCoPhepTinh = false;
    inRaNoiDung();
}

function xoaKyTuCuoi() {
    kyTuCuoi = noiDung.substr(noiDung.length - 1);
    if (kiemTraPhepTinh(kyTuCuoi))
        daCoPhepTinh = false;
    noiDung = noiDung.substring(0, noiDung.length - 1);
    inRaNoiDung();
}

function inKetQua() {
    var haiSo = noiDung.split(phepTinhHienTai);
    
    if (haiSo.length == 2) {
        var ketQua = 0;
        switch (phepTinhHienTai) {
            case "+":
                ketQua = +haiSo[0] + +haiSo[1];
                break;
            case "-":
                ketQua = +haiSo[0] - +haiSo[1];
                break;
            case "*":
                ketQua = +haiSo[0] * +haiSo[1];
                break;
            case "/":
                ketQua = +haiSo[0] / +haiSo[1];
                break;
            default:
                break;
        }
        daCoPhepTinh = false;
        noiDung = "";
        noiDung += ketQua;
        inRaNoiDung();
    }
}

function inRaNoiDung() {
    document.getElementById("output").value = noiDung;
}

function kiemTraPhepTinh(phepTinh) {
    var ketQua = false;
    for (var i = 0; i < dayPhepTinh.length; i++) {
        if (phepTinh == dayPhepTinh[i]) {
            ketQua = true;
            break;
        }
    }
    return ketQua;
}

window.addEventListener("keypress", function(event){
    var kyTu = String.fromCharCode(event.keyCode);
    var kyTuObject = {value: kyTu};
    if (+kyTu >= 0 && +kyTu <= 9) {
        ghiSo(kyTuObject)
    }

    if (kiemTraPhepTinh(kyTu)) {
        ghiPhepTinh(kyTuObject);
    }

    if (event.keyCode == 13) {
        inKetQua();
    }
});