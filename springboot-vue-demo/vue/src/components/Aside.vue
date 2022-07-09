<template>
  <div>
    <el-row class="tac">
      <el-col :span="24">
        <el-menu
            style="width: 200px; min-height: calc(100vh - 50px)"
            default-active=""
            router
            :default-openeds="['1']"
            class="el-menu-vertical-demo">
            <el-sub-menu index="1">
                <template #title>系统管理</template>
                <el-menu-item index="user">用户管理</el-menu-item>
            </el-sub-menu>
          <el-menu-item index="book">书籍管理</el-menu-item>
<!--            <el-menu-item index="data" :route="{path:'/'}">数据管理</el-menu-item>-->
<!--          <el-menu-item index="2">-->
<!--            <el-icon><icon-menu /></el-icon>-->
<!--            <span>Navigator Two</span>-->
<!--          </el-menu-item>-->
<!--          <el-menu-item index="4">-->
<!--            <el-icon><setting /></el-icon>-->
<!--            <span>Navigator Four</span>-->
<!--          </el-menu-item>-->
        </el-menu>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>