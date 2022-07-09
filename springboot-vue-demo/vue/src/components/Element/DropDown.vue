<template>
  <el-dropdown>
    <span class="el-dropdown-link">
      <br>个人信息
      <el-icon class="el-icon--right">
        <arrow-down />
      </el-icon>
    </span>
    <template #dropdown>
      <el-dropdown-menu>
          <el-dropdown-item>修改密码</el-dropdown-item>
          <el-dropdown-item @click="$router.push('/login')">退出系统</el-dropdown-item>
      </el-dropdown-menu>
    </template>
  </el-dropdown>
</template>

<script>
export default {
  name: "DropDown"
}
</script>

<style scoped>
.el-dropdown-link {
  cursor: pointer;
  color: var(--el-color-primary);
  display: flex;
  align-items: center;
}
.el-icon--right{
  cursor: pointer;
  color: var(--el-color-primary);
  display: flex;
  align-items: center;
}
</style>