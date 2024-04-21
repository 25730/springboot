<template>
  <div class="main-content">
    <div>
      <el-carousel :interval="4000" type="card" height="300px">
        <el-carousel-item v-for="item in carouselData" :key="item">
          <img :src="item" alt="" style="width: 100%; height: 300px; border-radius: 5px">
        </el-carousel-item>
      </el-carousel>
    </div>
    <div style="width: 80%; margin: 20px auto;">
      <div style="display: flex">
        <div style="width: 50%; height: 330px; margin-right: 17px; margin-top: 10px">
          <el-carousel height="330px">
            <el-carousel-item v-for="item in left" :key="item">
              <img :src="item" alt="" style="width: 100%; height: 330px">
            </el-carousel-item>
          </el-carousel>
        </div>
        <div style="width: 50%; height: 330px; margin-left: 17px">
          <el-tabs v-model="activeName">
            <el-tab-pane label="扶贫资讯" name="first">
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">【“飞阅”中国】江西安福：让文物活起来 助力乡村振兴，让文物活起来 助力乡村振兴</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">【“飞阅”中国】江西安福：让文物活起来 助力乡村振兴，让文物活起来 助力乡村振兴</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div><div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">【“飞阅”中国】江西安福：让文物活起来 助力乡村振兴，让文物活起来 助力乡村振兴</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">【“飞阅”中国】江西安福：让文物活起来 助力乡村振兴，让文物活起来 助力乡村振兴</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">【“飞阅”中国】江西安福：让文物活起来 助力乡村振兴，让文物活起来 助力乡村振兴</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">【“飞阅”中国】江西安福：让文物活起来 助力乡村振兴，让文物活起来 助力乡村振兴</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
            </el-tab-pane>
            <el-tab-pane label="扶贫政策" name="second">
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">传承井冈山精神 带领村民过上好日子</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">传承井冈山精神 带领村民过上好日子</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">传承井冈山精神 带领村民过上好日子</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">传承井冈山精神 带领村民过上好日子</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">传承井冈山精神 带领村民过上好日子</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
              <div style="display: flex; line-height: 48px; height: 48px">
                <div style="flex: 1; font-size: 17px; width: 0" class="overflowShow">传承井冈山精神 带领村民过上好日子</div>
                <div style="width: 150px; text-align: right; color: #a9a9b8; font-size: 15px">2024-4-15</div>
              </div>
            </el-tab-pane>
          </el-tabs>
        </div>
      </div>
      <div style="text-align: center; color: #19a14b; font-size: 25px; font-weight: 550; margin: 40px 0">魅力农家乐</div>
<div>
  <el-row :gutter="20">
    <el-col :span="8" style="margin-bottom: 50px">
      <img src="@/assets/imgs/lun-1.png" alt="" style="width: 100%; height: 180px; border-radius: 10px">
      <div style="text-align: center; font-size: 16px; font-weight: 530; margin-top: 10px">江苏省苏州市【田园绿洲】</div>
    </el-col>
    <el-col :span="8" style="margin-bottom: 50px">
      <img src="@/assets/imgs/lun-1.png" alt="" style="width: 100%; height: 180px; border-radius: 10px">
      <div style="text-align: center; font-size: 16px; font-weight: 530; margin-top: 10px">江苏省苏州市【田园绿洲】</div>
    </el-col>
    <el-col :span="8" style="margin-bottom: 50px">
      <img src="@/assets/imgs/lun-1.png" alt="" style="width: 100%; height: 180px; border-radius: 10px">
      <div style="text-align: center; font-size: 16px; font-weight: 530; margin-top: 10px">江苏省苏州市【田园绿洲】</div>
    </el-col>
  </el-row>
</div>
<div style="text-align: center; color: #19a14b; font-size: 25px; font-weight: 550">优质农产品</div>
<div style="height: 1000px">
  <el-row :gutter="20">
    <el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col>
    <el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col><el-col :span="4" style="margin-top: 30px">
      <img src="@/assets/imgs/葡萄.jpg" alt="" style="width: 100%; height: 180px; border-radius: 10px; border: 1px solid #cccccc">
      <div style="text-align: left; font-weight: 530; font-size: 16px; margin-top: 10px" class="overflowShow">葡萄</div>
      <div style="margin-top: 10px">
        <span style="color: red; margin-right: 30px">￥ 15</span>
        <el-button type="warning" size="mini">购买</el-button>
      </div>
    </el-col>
  </el-row>
</div>
    </div>
  </div>
</template>

<script>

export default {

  data() {
    return {
      carouselData: [
          require('@/assets/imgs/lun-1.png'),
          require('@/assets/imgs/lun-2.png'),
          require('@/assets/imgs/lun-3.png'),
      ],
      left: [
        require('@/assets/imgs/lun-1.png'),
        require('@/assets/imgs/lun-2.png'),
        require('@/assets/imgs/lun-3.png'),
      ],
      activeName: 'first'
    }
  },
  mounted() {

  },
  // methods：本页面所有的点击事件或者其他函数定义区
  methods: {

  }
}
</script>
<style scoped>
.overflowShow{
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
</style>