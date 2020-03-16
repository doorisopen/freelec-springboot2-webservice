# freelec-springboot2-webservice

[스프링 부트와 AWS로 혼자 구현하는 웹서비스 (프리렉, 이동욱 지음)](https://jojoldu.tistory.com/463) 책에서 공부한 내용을 기록한 저장소입니다.

2020-02-20 ~ 2020-00-00

# Dev Env
* IntelliJ IEDA Ultimate(Edu)
* Java 8
* Gradle 4.10.2

# TODO
* [x] __chap1.__ [[Blog] chap1.스프링 부트 시작하기](https://doorisopen.github.io/spring/2020/02/24/spring-freelec-springboot-chap1.html)
  + [Initial commit](https://github.com/doorisopen/freelec-springboot2-webservice/tree/65d50bdb356f414a2203bda39426a415311905bd)
  + [git ignore 등록](https://github.com/doorisopen/freelec-springboot2-webservice/tree/ea8b7660866754ff10e8ce2e81792888efc65a3e)
* [x] __chap2.__ [[Blog] chap2.테스트 코드 작성하기](https://doorisopen.github.io/spring/2020/02/24/spring-freelec-springboot-chap2.html)
  + [chap2.2 chapter 02(2.0~2.2). Test Code](https://github.com/doorisopen/freelec-springboot2-webservice/tree/0f599947a09e0173d32a0f238fdf786f809f3113)
  + [chap2.4(page 74) gradle downgrade(5.2.1->4.10.2)](https://github.com/doorisopen/freelec-springboot2-webservice/tree/ed4a54f5d6375bcd5afcaae7ea4c5d4219073b27)
  + [chap2.4 chapter 02. lombok&Test Code](https://github.com/doorisopen/freelec-springboot2-webservice/tree/6d751525cba0ee8ab7af1e07d51e00043ec1fd49)
* [x] __chap3.__ [[Blog] chap3.스프링 부트에서 JPA사용하기](https://doorisopen.github.io/spring/2020/02/26/spring-freelec-springboot-chap3.html)
  + [chap3.3 Spring Data JPA Test Code](https://github.com/doorisopen/freelec-springboot2-webservice/tree/3ba7953a30f1fabf4bf7ce1345f6945af153b057)
  + [chap3.4 등록/수정/조회 기능 & Test Code](https://github.com/doorisopen/freelec-springboot2-webservice/tree/ef3197a0e023dac89bb35b6cf82b8d9bbdfd2f8a)
  + [chap3.5 JPA Auditing(등록/수정 시간 자동화) & Test Code](https://github.com/doorisopen/freelec-springboot2-webservice/tree/2ab0ea02b3993d3a8f3691e1df42fd043750647c)
* [x] __chap4.__ [[Blog] chap4.Mustache로 화면 구성하기](https://doorisopen.github.io/spring/2020/03/03/spring-freelec-springboot-chap4.html)
  + [chap4.5 Mustache로 CRUD 구성하기](https://github.com/doorisopen/freelec-springboot2-webservice/tree/ca9af0b292be752aaa87b4d80b349ff8784c9dfa)
* [x] __chap5.__ [[Blog] chap5.스프링 시큐리티와 OAuth2.0](https://doorisopen.github.io/spring/2020/03/03/spring-freelec-springboot-chap5.html)
  + [chap5.2 add .gitignore](https://github.com/doorisopen/freelec-springboot2-webservice/tree/76ff9d724928d748f60f8cddbb992278947f587c)
  + [chap5.3 OAuth2 Google](https://github.com/doorisopen/freelec-springboot2-webservice/tree/c07ef6ee0f114280ff651528aad5905a609cb06c)
  + [chap5.4 SessionUser 애너테이션 기반으로 만들기](https://github.com/doorisopen/freelec-springboot2-webservice/tree/1d2f643eba4b2f340bd07ce56bf7a3d422a50630)
  + [chap5.5 데이터베이스를 세션 저장소로 사용하기](https://github.com/doorisopen/freelec-springboot2-webservice/tree/360188b6ce66100ac98476b44c4164b138bb898c)
  + [chap5.6 OAuth2 Naver](https://github.com/doorisopen/freelec-springboot2-webservice/tree/268dfa7e3eabcc0908f8c7a505c1d2a8480b7007)
  + [chap5.7 기존 테스트에 시큐리티 적용하기](https://github.com/doorisopen/freelec-springboot2-webservice/tree/acd91dfddd38c9fe7bd76de16075534daee1fa29)
* [x] __chap6.__ [[Blog] chap6.AWS EC2 서버 환경 구축하기](https://doorisopen.github.io/spring/2020/03/10/spring-freelec-springboot-chap6.html)
* [x] __chap7.__ [[Blog] chap7.AWS RDS 생성하기](https://doorisopen.github.io/spring/2020/03/11/spring-freelec-springboot-chap7.html)
* [x] __chap8.__ [[Blog] chap8.EC2 서버에 프로젝트 배포하기](https://doorisopen.github.io/spring/2020/03/12/spring-freelec-springboot-chap8.html)
  + [chap8.4 스프링 부트 프로젝트로 RDS 접근하기](https://github.com/doorisopen/freelec-springboot2-webservice/tree/b68c56e2406081251d3be71cf664979907b85839)
* [x] __chap9.__ [[Blog] chap9.Travis CI 배포 자동화](https://doorisopen.github.io/spring/2020/03/13/spring-freelec-springboot-chap9.html)
  + [chap9.2 Travis CI 배포 자동화](https://github.com/doorisopen/freelec-springboot2-webservice/tree/61fb10bccc2edcd3f7edca0b4d1b96bd944f673c)
  + [chap9.3 Travis CI 배포 자동화(code push > auto deploy)](https://github.com/doorisopen/freelec-springboot2-webservice/tree/865dda366bf3702da7380f1cd5aa0ab03cdda0fd)
  + [chap9.4 Travis CI,S3,Code Deploy 연동](https://github.com/doorisopen/freelec-springboot2-webservice/tree/6a87a94eb87eabea69def741debaa2ec04961cca)
  + [chap9.5 배포 자동화 구성](https://github.com/doorisopen/freelec-springboot2-webservice/tree/23d81e1882c4782cdb7019e43ffad9ba1111741d)
  + [chap9.5 배포 테스트](https://github.com/doorisopen/freelec-springboot2-webservice/tree/6f316b63035c8747842b3a7d66280cf3cf766916)
* [x] __chap10.__
  + [chap10.3 무중단 배포 스크립트 작성 & 테스트 코드](https://github.com/doorisopen/freelec-springboot2-webservice/tree/dc31295798febe681e44c5729e73a08cef79e4e6)
  + [chap10.4 무중단 배포 테스트(code modify)](https://github.com/doorisopen/freelec-springboot2-webservice/tree/f434bc09d011423dd8162e0404bb57e4442deb3f)
* [x] __chap11.__
