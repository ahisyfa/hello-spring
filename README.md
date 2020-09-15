# Belajar Spring Framework

# Inversion of Control
"Inversion of control is an approach of outsourcing the construction and management of object."
Singkatnya, aplikasi yang kita buat akan melakukan outsourcing dalam pembuatan dan pengolahan objek.
Proses outsourcing akan ditangani oleh sebuah pabrik objek (Object Factory).

Perhatikan Kelas IocDemo.java. Saat kita membuat object `Instrument i`, maka object `i` merujuk ke objek dari kelas `Guitar` 
yang merupakan implementasi interface  `Instrument`
sudah tidak bisa diubah-ubah lagi.
```
Instrument i = new Guitar(); // Object i adalah instance dari Kelas Guitar
System.out.println(i.play());

```

Cara pembuatan object yang demikian mengakibatkan object `Instrument` adalah reference dari instance kelas `Guitar` 
dan tidak bisa diubah secara konfigurasi. 

Sekarang perhatikan gambar berikut:

```
             KONSEP INVERSION OF CONTROL

___________                                          Spring
|         |    kasih saya 'Instrument' objek      _______________
| IoCApp  |    ------------------------------>    |    Object   |
|         |    <-----------------------------     |    Factory  |
-----------                                       _______________
                                                         |
                                                         |
                                                         v
                                                   Configuration
                                                        /|\
                                                       / | \
                                                  Piano  |  \
                                                       Gitar \
                                                             Gendang
```
Dengan konsep diatas, maka aplikasi kita bisa lebih dikonfigurasi. Dengan menggunakan IoC maka 
implementasi dari object `Instrument` dapat kita ubah-ubah dari `configuration` secara mudah.
Implementasi  object `Instrument` dapat berupa `Guitar`, `Piano` dan `Gendang` tergantung konfigurasi kita
pada file `configurasi`. Disini `object factory` bertugas untuk memberikan implementasi object yang sesuai 
dengan apa yang kita inginkan/kofigurasikan.

# Spring Container
Fungsi utama Spring Container:
1. Membuat dan mengelola objek (Inversion of Control)
2. Inject object's dependencies (Dependency Injection)

Cara mengkonfigurasi Spring Container:
1. XML Configuration file (*legacy*)
2. Java Annotation (modern)
3. Java Souce Code (modern)

## Proses Membangun Aplikasi Spring
Berikut adalah proses development dengan Spring
1. Membuat konfigurasi Spring Bean
2. Membuat Spring Container
3. Ambil bean dari Spring Container

### 1. Membuat konfigurasi Spring Bean
Konfigurasi Spring Beans biasanya disimpan dalam file `appContext.xml`
```
  <beans ... >
     <bean id="gendang"
         class=" com.github.ahisyfa.hellospring.ioc.Gendang">
     <bean/>
  </beans>
```

### 2. Membuat Spring Container
Spring Container disebut juga sebagai `ApplicationContext`.

Specialized Impementasinya berupa:
- ClassPathXmlApplicationContext
- AnnotationConfigApplicationContext
- GenericWebApplicationContext
- *dan lainnya* ....

```
   ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");
```

### 3. Ambil bean dari Spring Container
```
   ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");
   
   // Ambil bean dari spring container
   Instrument i = context.getBean("gendang", Gendang.class); 
   System.out.println(i.play());
```

Perhatikan `context.getBean("gendang", Gendang.class);` parameter `"gendang"` ada id pada definisi bean di tahap 1.


Contoh implementasi silahkan lihat file `IoAppRevisited.java`;

## Apa itu Spring Bean
`Spring Bean` pada dasarnya adalah sebuah kelas java biasa. Ketika sebuah java objek dibuat oleh Spring Container
kemudian Spring menyebut objek tersebut sebagai `Spring Bean`.  `Spring Bean` dibuat dari Java class normal, 
sama seperti instansiasi obejek pada biasanya.

# Gambaran tentang Beans
Spring IoC container mengelola satu atau lebih bean. Bean-bean tersebut dibuat berdasarkan konfigurasi metadata yang kita berikan 
kepada Spring IoC Containter.

## Penamaan Beans
Best-practice penamaan beans mengikuti penamaan field pada java.

## Instantiating Beans
- Instansiasi dengan Contructor
- Instansiasi dengan Static Factory Method
- Instansiasi dengan Instance Factory Method

