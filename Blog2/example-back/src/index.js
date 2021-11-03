// 이 파일에서만 no-global-assign ESLint 옵션을 비활성화합니다
/* eslint-disable no-global-assign */

// import / export 문법 사용할 수 있도록 esm 모듈 사용.
require = require('esm')(module /*, options*/);
module.exports = require('./main.js');