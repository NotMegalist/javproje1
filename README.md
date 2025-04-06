Bu program kullanıcıdan film ve müşteri bilgilerini alıp, bu bilgileri dizilerde saklayarak daha sonra kullanıcıya bilet oluşturma ve listeleme imkanı sağlar.

İlk olarak diziler oluşturuldu. Film adları, film türleri, film süreleri, müşteri adları ve müşteri emailleri için ayrı ayrı diziler tanımlandı. Ayrıca müşteri ile film eşleştirmesini tutmak için iki boyutlu bir bilet dizisi oluşturuldu.

Kullanıcı arayüzü switch-case yapısıyla hazırlandı. Kullanıcıdan yapılacak işlem numarası alınıyor ve her bir case ifadesi ilgili fonksiyonu çağırıyor. Bu sayede menü üzerinden kullanıcı istediği işlemi seçip yapabiliyor.

scanner.close(); komutu program sonunda bir kez çalıştırılarak kullanıcıdan veri alma işlemi kapatılıyor. Bu komutu her fonksiyonun sonunda ayrı ayrı yazmak yerine, sadece en sonda bir kez kullanmak daha mantıklı ve temiz bir çözüm oldu.

Film ve müşteri verileri kullanıcıdan Scanner sınıfı kullanılarak alındı. Özellikle scanner.nextLine(); kullanılarak boşluklu isim ve tür gibi verilerin tamamı eksiksiz alındı.

Bilet satışı için önce kullanıcıya kayıtlı müşteriler ve filmler gösterildi. Kullanıcıdan seçim yapması istendi. Ardından seçilen müşteri ile seçilen film, bilet dizisinde eşleştirilerek kayıt edildi.

En son olarak, biletleri listeleme işleminde her müşteri için hangi filmlerin izlendiği for döngüsü ile kontrol edilip ekrana yazdırıldı. Eğer bir müşterinin hiç filmi yoksa “Film kaydı yok.” mesajı verildi.

Bu program sayesinde temel diziler, kullanıcı girişi, fonksiyon kullanımı, switch-case yapısı ve veri eşleştirme konularında pratik yapılmış oldu.
