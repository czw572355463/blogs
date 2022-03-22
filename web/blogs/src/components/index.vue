<template>
  <div class="hello">
	  <el-tabs v-model="activeName" type="<card></card>" @tab-click="handleClick">
	    <el-tab-pane label="用户管理" name="first"><demo></demo></el-tab-pane>
	    <el-tab-pane label="配置管理" name="second">配置管理</el-tab-pane>
	    <el-tab-pane label="角色管理" name="third">角色管理</el-tab-pane>
	    <el-tab-pane label="定时任务补偿" name="fourth">定时任务补偿</el-tab-pane>
	  </el-tabs>
  </div>
</template>

<script>

import demo from './chile/demo.vue'

export default {
  name: 'index',
    data() {
        return {
          activeName: 'second'
        };
      },
      methods: {
        handleClick(tab, event) {
          console.log(tab, event);
        }
      },components:{
		  demo
	  }
}
</script>


<style scoped>

	<style>
	  .el-row {
	    margin-bottom: 20px;
	    &:last-child {
	      margin-bottom: 0;
	    }
	  }
	  .el-col {
	    border-radius: 4px;
	  }
	  .bg-purple-dark {
	    background: #99a9bf;
	  }
	  .bg-purple {
	    background: #d3dce6;
	  }
	  .bg-purple-light {
	    background: #e5e9f2;
	  }
	  .grid-content {
	    border-radius: 4px;
	    min-height: 36px;
	  }
	  .row-bg {
	    padding: 10px 0;
	    background-color: #f9fafc;
	  }
	</style>
</style>
