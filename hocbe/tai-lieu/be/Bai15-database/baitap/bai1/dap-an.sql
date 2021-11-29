-- Câu 1:
SELECT GV.Magv, GV.Hotengv, K.Tenkhoa
FROM TBLGiangVien GV join TBLKhoa K
ON GV.Makhoa = K.Makhoa;
-- Câu 2:
SELECT GV.Magv, GV.Hotengv, K.Tenkhoa
FROM TBLGiangVien GV JOIN TBLKhoa K
ON GV.Makhoa = K.Makhoa 
WHERE K.Tenkhoa = 'Dia ly va QLTN';
-- Câu 3:
SELECT COUNT(SV.MASV) AS SỐ_SV
FROM TBLSinhVien SV
WHERE Makhoa='Bio';
-- Câu 4:
SELECT SV.Masv, SV.Hotensv
FROM TBLSinhVien SV JOIN TBLKhoa K
ON SV.Makhoa = K.Makhoa
WHERE K.Tenkhoa='TOAN';
-- Câu 5:
SELECT COUNT(GV.Magv) AS SỐ_GV
FROM TBLGiangVien GV join TBLKhoa K
ON GV.Makhoa = K.Makhoa
WHERE K.Tenkhoa='CONG NGHE SINH HOC';
-- Câu 6:
SELECT SV.Masv,SV.Hotensv
FROM TBLSinhVien SV 
WHERE NOT EXISTS(
SELECT HD.Masv
FROM TBLHuongDan HD 
WHERE SV.Masv = HD.Masv);
-- Câu 7:
SELECT K.Makhoa,K.Tenkhoa, COUNT(K.Makhoa) AS SO_GV
FROM TBLGiangVien GV JOIN TBLKhoa K
ON GV.Makhoa = K.Makhoa
GROUP BY K.Makhoa,K.Tenkhoa;
-- CÂU 8:
SELECT k.Dienthoai
FROM TBLKhoa K join TBLSinhVien SV
ON K.Makhoa = SV.Makhoa
WHERE SV.Hotensv = 'Le Van Son';
-- CÂU 9:
SELECT DT.Madt,DT.Tendt
FROM TBLGiangVien GV join TBLHuongDan HD
ON GV.Magv = HD.Magv
join TBLDeTai DT
ON DT.Madt = HD.Madt
WHERE GV.Hotengv = 'Tran Son';
-- Câu 10:
SELECT DT.Madt,DT.Tendt
FROM TBLDeTai DT
WHERE NOT EXISTS(
SELECT HD.Madt
FROM TBLHuongDan HD
WHERE HD.Madt = DT.Madt);
-- Câu 11:
SELECT GV.Magv,GV.Hotengv,K.Tenkhoa
FROM TBLGiangVien GV JOIN TBLKhoa K
ON GV.Makhoa = K.Makhoa
WHERE GV.Magv IN (
SELECT HD.Magv
FROM TBLHuongDan HD
GROUP BY HD.Magv
HAVING COUNT(HD.MaSV)>3);
-- Câu 12:
SELECT DT.Madt,DT.Tendt
FROM TBLDeTai DT 
WHERE DT.Kinhphi = (
SELECT MAX(DT.Kinhphi)
FROM TBLDeTai DT);
-- Câu 13:
SELECT DT.Madt,DT.Tendt
FROM TBLDeTai DT
WHERE DT.Madt in (
SELECT HD.Madt
FROM TBLHuongDan HD
GROUP BY HD.Madt
HAVING COUNT(HD.Madt) > 2);
-- Câu 14:
SELECT SV.Masv,SV.Hotensv,HD.KetQua
FROM TBLSinhVien SV JOIN TBLHuongDan HD
ON SV.Masv = HD.Masv
JOIN TBLKhoa K
ON K.Makhoa = SV.Makhoa
WHERE K.Tenkhoa = 'Dia ly va QLTN';
-- Câu 15:
SELECT K.Tenkhoa, COUNT(SV.Masv) AS Số_SV
FROM TBLSinhVien SV JOIN TBLKhoa K
ON SV.Makhoa = K.Makhoa
GROUP BY K.Tenkhoa;
-- Câu 16: 
SELECT *
FROM TBLSinhVien SV JOIN TBLHuongDan HD
ON HD.Masv = SV.Masv
JOIN TBLDeTai DT
ON DT.Madt = HD.Madt
WHERE SV.Quequan = DT.Noithuctap;
-- Câu 17:
SELECT *
FROM TBLSinhVien SV JOIN TBLHuongDan HD
ON HD.Masv = SV.Masv
WHERE HD.KetQua is Null;
-- Câu 18:
SELECT SV.Masv,SV.Hotensv
FROM TBLSinhVien SV JOIN TBLHuongDan HD
ON HD.Masv = SV.Masv
WHERE HD.KetQua = 0;