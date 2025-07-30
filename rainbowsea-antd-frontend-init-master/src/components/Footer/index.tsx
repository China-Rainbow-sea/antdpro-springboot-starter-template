import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '程序员 ';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'codeNav',
          title: '编程导航',
          href: 'https://yupi.icu',
          blankTarget: true,
        },
        {
          key: 'Ant Design',
          title: '编程宝典',
          href: 'https://codefather.cn',
          blankTarget: true,
        },
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined />  源码
            </>
          ),
          href: 'https://github.com/China-Rainbow-sea',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
