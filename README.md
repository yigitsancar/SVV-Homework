# Book Author API

Bu proje, yazarlar ve kitaplar arasında ilişki kuran bir Spring Boot uygulamasıdır. Uygulama, yazarlar ve kitaplar üzerinde CRUD (Create, Read, Update, Delete) işlemleri yapmanıza olanak tanır.

## Özellikler

- Yazarlar ve kitaplar arasında bir ilişki kurar (Bir yazar birden fazla kitaba sahip olabilir).
- Yazarlar ve kitaplar için RESTful API uç noktaları sağlar.
- PostgreSQL veritabanı ile entegre çalışır.
- Spring Data JPA kullanılarak veritabanı işlemleri gerçekleştirilir.
- Spring Boot Validation ile giriş doğrulama desteği.
- OpenAPI (Swagger UI) entegrasyonu ile API dokümantasyonu.

## Kullanılan Teknolojiler

- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- Spring Boot Starter Web
- PostgreSQL
- Lombok
- Spring Boot Validation
- SpringDoc OpenAPI

## Kurulum

### Gereksinimler

- Java 17 veya üstü
- Maven
- PostgreSQL

### Adımlar

Bu projeyi klonlayın:

```bash
git clone https://github.com/kullaniciadi/book-author-api.git
cd book-author-api
```

PostgreSQL'de bir veritabanı oluşturun:

```sql
CREATE DATABASE book_author_db;
```

`application.properties` dosyasını açarak veritabanı bağlantı bilgilerinizi güncelleyin:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/book_author_db
spring.datasource.username=postgres
spring.datasource.password=parolaniz
```

Maven bağımlılıklarını yükleyin ve projeyi çalıştırın:

```bash
./mvnw spring-boot:run
```

## API Uç Noktaları

### Yazarlar

- `GET /authors` - Tüm yazarları getirir.
- `POST /authors` - Yeni bir yazar oluşturur.

### Kitaplar

- `GET /books` - Tüm kitapları getirir.
- `POST /books` - Yeni bir kitap oluşturur.

## Swagger UI

API dokümantasyonuna erişmek için uygulama çalışırken aşağıdaki URL'yi ziyaret edin:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Testler

Testleri çalıştırmak için şu komutu kullanabilirsiniz:

```bash
./mvnw test
```

## Katkıda Bulunma

Katkıda bulunmak isterseniz, lütfen bir pull request gönderin.

## Lisans

Bu proje Apache 2.0 Lisansı ile lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasına bakabilirsiniz.
