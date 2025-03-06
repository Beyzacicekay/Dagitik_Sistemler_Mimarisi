Projenin Amacı
Bu proje, Docker ve Docker Compose kullanılarak oluşturulmuş bir dağıtık sistem mimarisidir. Temel amaç, modern uygulama geliştirme ve dağıtık sistemlerin nasıl çalıştığını göstermektir. Projede, bir Spring Boot uygulaması, PostgreSQL veritabanı, Redis cache ve Nginx yük dengeleyici bir arada çalışmaktadır.

Mimari Yapı

Nginx:
Yük dengeleyici olarak çalışır.
Gelen istekleri iki adet Spring Boot uygulama sunucusuna dağıtır.
Bir sunucu çöktüğünde, diğer sunucuya otomatik olarak yönlendirme yapar (failover mekanizması).

Spring Boot Uygulamaları:
İki adet replikasyonlu uygulama sunucusu bulunur.
PostgreSQL veritabanı ve Redis cache ile entegre çalışır.
Uygulama, kullanıcı verilerini yönetir.

PostgreSQL:
Uygulamanın verilerini saklar.
Verilerin kalıcı olması için Docker volume kullanılır.

Redis:
Uygulamanın performansını artırmak için cache mekanizması sağlar.
