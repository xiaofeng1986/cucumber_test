# language: zh-CN
功能: 图片接入中台接口
  为了能够导入图片到中台进行审核
  作为上游接口调用者
  我想要导入图片到中台

  场景: 调用图片接入中台接口包含所有字段
    假如 已准备的接口请求内容包含所有字段
    当 调用图片接入接口
    那么 调入接口成功，中台生成新记录