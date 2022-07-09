<template>
  <div style="height: 50px; line-height: 50px; border-bottom: 1px solid #ccc; display: flex">
    <div style="width: 200px; padding-left: 30px; font-weight: bold; color: dodgerblue">后台管理</div>
    <div style="flex: 1"></div>
    <div style="width: 100px;">
      <div style="display: flex">
        <DropDown />
      </div>
    </div>
  </div>
</template>

<script>
import DropDown from "@/components/Element/DropDown";

export default {
  name: "Header",
  components: {
    DropDown
  }
}


</script>

<style scoped>
.el-dropdown-link, el-icon--right {
  cursor: pointer;
  color: var(--el-color-primary);
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
