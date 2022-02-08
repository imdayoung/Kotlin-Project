## 화면 구성 및 기능 구현 정도
### 1. 첫 화면
![KakaoTalk_20220209_015425252](https://user-images.githubusercontent.com/86220363/153037175-f6c0d925-0896-4f4e-bfb7-c0ed08a6329e.png)

앱을 실행시키면 처음 나오는 페이지이다. 시작하기 버튼을 두어 버튼을 클릭하면 홈 화면으로 넘어가게 했다.

### 2. 홈 화면
![KakaoTalk_20220209_015431133](https://user-images.githubusercontent.com/86220363/153037184-35099972-0a82-4331-8ed6-1f355ba4b84e.png)

RecyclerView를 사용하여 보드게임의 종류와 간단한 설명을 보여주는 페이지를 구성했다. 상단 나의 후기 버튼을 클릭하면 4. 후기 화면으로 넘어가고, item을 선택하면 각 item에 해당하는 보드게임의 3. 게임 설명 페이지로 넘어간다.

### 3. 게임 설명 페이지
![KakaoTalk_20220209_015436426](https://user-images.githubusercontent.com/86220363/153037200-b8d45913-8f9b-4612-a180-fe5dda8ea612.png) ![KakaoTalk_20220209_015440334](https://user-images.githubusercontent.com/86220363/153037207-41dbc46a-04be-4f5a-b4c1-8bf8bcac2d50.png)

해당 페이지에 각 보드게임 설명 비디오를 첨부할 계획이었는데, VideoView를 제대로 구현하지 못하여 ScrollView을 사용하여 사진과 글로 설명을 하는 페이지를 구성했다. 상단 홈으로 버튼을 클릭하여 홈 화면으로 이동할 수 있다.

### 4. 후기 화면
![KakaoTalk_20220209_015444069](https://user-images.githubusercontent.com/86220363/153037223-4febda13-639a-430f-92ba-bf19b5e939dd.png)

memo DB에 저장된 후기들이 RecyclerView를 통해 화면에 출력되어야 하는데 이 기능을 제대로 구현하지 못했다. 상단 홈으로 버튼을 클릭하여 홈 화면으로 이동할 수 있고 추가하기 버튼을 클릭하여 5. 후기 추가 화면으로 이동할 수 있다.

### 5. 후기 추가 화면
![KakaoTalk_20220209_015447012](https://user-images.githubusercontent.com/86220363/153037243-28f76119-271b-43d3-980e-81bff5b32697.png) ![KakaoTalk_20220209_015450905](https://user-images.githubusercontent.com/86220363/153037251-0bcc6ec1-1ee2-418f-aed1-6551d6edb3d4.png)

후기를 작성하고자 하는 보드게임의 이름, 한줄평, 짧은 후기를 작성할 수 있는 페이지이다. 한줄평은 spinner을 사용하여 선택하도록 하려고 했는데, 아직 이해가 부족하여 모두 EditText로 통일하여 사용자로부터 입력받도록 하였다.

### 6. Database Inspector
![KakaoTalk_20220209_015453313](https://user-images.githubusercontent.com/86220363/153037260-c51beb5a-b81d-493b-b571-9eacdcfb2751.png)

Database Inspector을 통해 입력한 후기가 DB에 저장되는 것을 확인할 수 있다.
