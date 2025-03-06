# Dağıtık Sistemler

## Proje Hakkında

Bu proje, Docker ve Docker Compose kullanılarak oluşturulmuş bir dağıtık sistem mimarisidir. Temel amaç, modern uygulama geliştirme ve dağıtık sistemlerin nasıl çalıştığını göstermektir. Projede, bir Spring Boot uygulaması, PostgreSQL veritabanı, Redis cache ve Nginx yük dengeleyici bir arada çalışmaktadır.Bu proje, modern uygulama geliştirme ve dağıtık sistem mimarilerini öğrenmek amacıyla hazırlanmıştır. Docker Compose kullanılarak, tüm servisler (Nginx, Spring Boot uygulamaları, PostgreSQL ve Redis) container'lar içerisinde konfigüre edilmiştir. Ayrıca, Nginx yapılandırması ile failover mekanizması sağlanarak, herhangi bir uygulama sunucusu devre dışı kaldığında isteklerin diğer sunucuya yönlendirilmesi sağlanmıştır.

## Mimari Tasarım

- **Nginx:**  
  - Yük dengeleyici olarak çalışır ve gelen istekleri Spring Boot uygulama sunucularına yönlendirir.
  - Bir sunucu çöktüğünde, diğer sunucuya otomatik olarak yönlendirme yapar (failover mekanizması)..

- **Spring Boot :**  
  - İki adet replikasyonlu uygulama sunucusu bulunur.
  - Uygulama sunucuları, PostgreSQL veritabanı ve Redis cache ile entegre çalışmaktadır.

- **PostgreSQL:**  
  - Uygulama verilerinin saklanması için kullanılır.
  - PostgreSQL veritabanı ve Redis cache ile entegre çalışır.

- **Redis:**  
  - Uygulama performansını artırmak için cache mekanizması sağlar.
 
## Video linkine aşağıdan ulaşabilirsiniz 
[dağıtık sistemler video link ](https://drive.google.com/file/d/1zydoaBiT6jfDIdpmwEeDs8Xz8Th1Y5v6/view?usp=drive_link)
