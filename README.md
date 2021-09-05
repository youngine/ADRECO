# ADRECO
광고 추천 및 피드백 시스템
> 리팩토링  (2021.06.15 ~) 

<br>

## 기획 배경
- 증가하는 디지털 옥외 광고 시장
  - 현재 디지털 옥외 광고 시장 규모는 다음 그림 1과 같이 꾸준히 증가하고 있는 추세이다. 아날로그 광고를 교체하려면 광고판 자체를 교체해야 하지만 디지털 광고를 이용하면 네트워크를 통해 손쉽게 교체 가능하다. 디지털 광고를 이용하면 아날로그 광고의 가장 큰 문제점인 교체의 번거로움을 덜 수 있기 때문에 앞으로도 더욱 디지털 광고의 규모는 커질 것이다.
- 길거리 광고판에 대한 낮은 관심도
  - 하지만 증가하고 있는 디지털 옥외 광고의 규모에 비해 시민들의 길거리 광고판에 대한 관심도는 낮은 편이다. 그 이유로 연령과 성별에 따른 다른 관심사를 들 수 있다. 현재 설치되어 이용되고 있는 정적인 옥외광고는 모든 연령층의 관심을 갖기는 어렵다. 광고의 카테고리에 따라 관심을 갖고 있는 연령층과 성별은 제한적이기 때문에 모든 연령층을 타겟으로 하여 광고를 하는 것은 어렵다.

<br>

## 과제
- 소비자의 관심 분야를 예측하고 이에 알맞은 광고를 추천하여 소비 활동을 장려한다.
  - 소비자가 광고를 긍정적으로 인식할 수 있도록 도우며, 제품 구매를 위한 긍정적인 수단으로서 광고를 활용할 수 있도록 한다.
- 송출된 광고에 대한 소비자의 관심도를 분석하고 시각화하여 광고주를 위한 피드백 자료로 활용한다.
  - 광고의 품질을 높여 기업의 최종 목적인 제품의 수익 창출 목적을 달성할 수 있도록 돕는다.

<br>

## 프로세스
![image](https://user-images.githubusercontent.com/62068895/132114777-20f4aa5d-3233-4af2-94d8-108de53ff755.png)   
- 본 과제는 크게 11개의 단계로 구성되어 있다. 먼저 광고판 앞의 사람들의 성별, 연령대를 추정하기 위해 영상 이미지에서 사람의 얼굴을 검출한다. 학습된 모델을 활용해 검출된 얼굴의 성별, 연령을 추정하고 광고 송출을 위한 키워드(관심사)를 추출한다. 키워드로 웹 크롤링 하여 실시간으로 가장 인기 있는 광고들을 가져와 송출한다. 이제 광고판 앞의 사람들의 시선을 추적하기 위해 Eye tracking 기술을 활용한다. 웹캠의 이미지를 사용하여 얼굴을 감지하고 시선 각도를 추론하여 실시간으로 사용자의 시선을 추적한다. 이를 통해 광고판 앞의 사람들이 실제로 광고를 보고 있는지, 보고 있다면 얼마나 보는지 측정한다. 측정된 데이터는 데이터베이스에 축적하고 이후에 종합하여 모니터링 웹에 도표로 나타낸다. 이를 통해 광고주들은 자신의 광고에 대한 피드백을 얻을 수 있다.

<br>

## 개발 환경
### Frontend
- Vue.js

### Backend
- Spring Boot

### Machine Learning
- Python 3.6.10
- Tensorflow 2.3.0
- CUDA 10.1
- cuDNN 7.6.5
- torch 1.7.0
- opencv 3.2.0

### 협업
- GitHub

<br>

## 아키텍처


<br>

## 머신러닝
### 연령-성별 예측
    학습 모델 : EfficientNetB3
    데이터셋 : imdb
학습 과정 : [연령-성별 예측 모델 학습](https://github.com/heung27/ADRECO/blob/f6dc216e5d23c16d81f35056656c30a9cdb9778f/document/%EC%97%B0%EB%A0%B9-%EC%84%B1%EB%B3%84%20%EC%98%88%EC%B8%A1%20%EB%AA%A8%EB%8D%B8%20%ED%95%99%EC%8A%B5.md)

<br>

### 시선 추적
    학습 모델 : mobilenet_v2
    데이터셋 : MPIIFaceGaze_normalizad
학습 과정 : [시선 추적 모델 학습](https://github.com/heung27/ADRECO/blob/f6dc216e5d23c16d81f35056656c30a9cdb9778f/document/%EC%8B%9C%EC%84%A0%20%EC%B6%94%EC%A0%81%20%EB%AA%A8%EB%8D%B8%20%ED%95%99%EC%8A%B5.md)

<br>

## 산출물
- [프로젝트 PPT](https://github.com/heung27/ADRECO/blob/f6dc216e5d23c16d81f35056656c30a9cdb9778f/document/%EA%B4%91%EA%B3%A0%20%EC%B6%94%EC%B2%9C%20%EB%B0%8F%20%ED%94%BC%EB%93%9C%EB%B0%B1%20%EC%8B%9C%EC%8A%A4%ED%85%9C.pdf)
- [보고서](https://github.com/heung27/ADRECO/blob/f6dc216e5d23c16d81f35056656c30a9cdb9778f/document/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EB%B3%B4%EA%B3%A0%EC%84%9C.pdf)
- [화면설계]()
- [DB설계]()

<br>
